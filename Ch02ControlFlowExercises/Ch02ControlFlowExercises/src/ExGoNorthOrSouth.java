import stanford.karel.Karel;

public class ExGoNorthOrSouth extends Karel {

        public void run() {
        }

        void turnRight() {
                for (int i = 0; i < 3; i++) {
                        turnLeft();
                }
        }

}
