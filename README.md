# Java Assignments

Programs are grouped by topic under `assignments/`. Each assignment is an
independent Java program; compile and run it from the repository root.

## Assignments

- `01-basics`: Hello World, addition, calculator, and swapping numbers
- `02-conditionals`: even/odd and largest-number examples
- `03-loops`: sum of even numbers
- `04-inheritance`: animal, vehicle, and phone inheritance examples
- `05-exceptions`: exception handling

Each runnable program prints the student's name and register number before its
demonstration output.

## Compile and run

For example, compile and run the Hello World assignment:

```powershell
javac -d out assignments\01-basics\HelloWorld.java
java -cp out HelloWorld
```

Use the corresponding `.java` file path and public class name to run another
assignment. Compiled `.class` files are generated in `out/` and are not part of
the source assignments.
