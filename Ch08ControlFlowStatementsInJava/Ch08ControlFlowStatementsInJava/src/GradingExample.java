import acm.program.ConsoleProgram;

public class GradingExample extends ConsoleProgram {
        @Override
        public void run() {
                //setFont("JetBrains Mono NL-26");
                int score = readInt("Enter subject score: ");
                // just to illustrate how cascading if works
                // score က 0-100 ဆိုတာ သေချာရင်တော့ ဒီလိုရေးလို့ရတယ်
                if (score >= 75) {
                        println("A");
                } else if (score >= 60) {
                        println("B");
                } else if (score >= 40) {
                        println("C");
                } else if (score >= 0) {
                        println("D");
                } else {
                        println("Undefined Grade!");
                }
        }
}
