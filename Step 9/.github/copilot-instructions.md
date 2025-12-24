# AI Coding Instructions - Striver's A2Z DSA Step 9 (Stack & Queue)

## Project Overview
This is a collection of DSA problem solutions focused on Stack and Queue implementations and related algorithms. Part of Striver's A2Z DSA course, specifically Step 9 which covers stack/queue data structures and their applications.

## Code Structure & Conventions

### File Naming
- One problem per file, named descriptively after the problem (e.g., `celebrityproblem.java`, `infixtopostfix.java`)
- No package declarations - all files are in the root of Step 9 directory
- Class names match file names exactly

### Solution Structure Pattern
Each file follows this standard structure:
```java
// 1. Imports (if needed)
import java.util.Stack;

// 2. Helper classes (if needed)
class Pair { ... }

// 3. Main class with problem solution
public class problemname {
    public static void main(String[] args) {
        // Test case initialization
        
        // Bruteforce solution (commented out)
        // Shows O(n²) or naive approach
        
        // Optimized solution (active)
        // Shows optimal approach with better time complexity
        
        // Output/testing
    }
}
```

### Code Style Conventions
- **Variable naming**: lowercase with no underscores (`knowme`, `iknow`, `topmost`)
- **Spacing**: No space before parentheses in method calls/conditions
- **Stack operations**: Use Java's built-in `Stack<>` or `Deque<>` from `java.util`
- **Array initialization**: Inline format `int[] arr = {1,2,3}` without spaces after commas
- **String building**: Use `StringBuilder` for efficiency (see [infixtopostfix.java](infixtopostfix.java))

### Solution Documentation Pattern
**Always include both approaches:**
1. **Bruteforce** - Commented out but preserved to show initial thinking
   - Example: [celebrityproblem.java](celebrityproblem.java#L7-L29) shows O(n²) approach with tracking arrays
2. **Optimized** - Active code implementing optimal algorithm
   - Example: [slidingwindowmax.java](slidingwindowmax.java#L27-L47) uses Deque for O(n) solution

### Common Data Structures
- **Stack**: Use `Stack<Integer>` or `Stack<Character>` for monotonic stack problems
- **Deque**: Use `Deque<Integer> dq = new LinkedList<>()` for sliding window problems
- **Custom classes**: Define helper classes like `Pair` above the main class (see [Minstack.java](Minstack.java#L3-L8))

### Algorithm Patterns

#### Monotonic Stack (NGE problems)
Right-to-left traversal pattern used in [nextgreatele.java](nextgreatele.java#L20-L31):
```java
for(int i=n-1; i>=0; i--) {
    while(!st.isEmpty() && st.peek() <= arr[i]) {
        st.pop();
    }
    nge[i] = st.isEmpty() ? -1 : st.peek();
    st.push(arr[i]);
}
```

#### Expression Conversion
Operator precedence helper method pattern (see [infixtopostfix.java](infixtopostfix.java#L5-L17)):
- Use `switch` statement returning precedence integers
- Handle `+`, `-` (prec 1), `*`, `/` (prec 2), `^` (prec 3)

## Testing & Execution
- All solutions contain test cases in `main()` with hardcoded inputs
- Run individual files: `java filename.java` from the Step 9 directory
- Expected outputs are printed to console
- No unit testing framework - verification via console output

## When Writing New Solutions
1. Start with bruteforce in comments to document naive approach
2. Implement optimized solution as active code
3. Include test case with expected output in main()
4. Use descriptive variable names reflecting problem domain
5. Add inline comments explaining key algorithmic steps (especially for complex logic)
6. For expression problems, always validate parentheses matching
