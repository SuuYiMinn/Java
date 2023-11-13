import acm.program.ConsoleProgram;

public class CountingWithWhile extends ConsoleProgram {
        public void run() {
                int count = 0;
                while (count < 10) {
                        println(count);
                        count++;
                }
        }
}
