import acm.program.ConsoleProgram;

public class WhichPowerOfTwoWithBreak extends ConsoleProgram {
        public void run() {
                int powOfTwo = readInt("Enter power of two: ");
                int n = 0;
                int result = 1;
                while (true) {
                        if (powOfTwo == result) break;
                        result *= 2;
                        n++;
                }
                println(n);
        }
}
