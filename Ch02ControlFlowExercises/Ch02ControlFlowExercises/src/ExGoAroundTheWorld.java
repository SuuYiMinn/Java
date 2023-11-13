import stanford.karel.Karel;

public class ExGoAroundTheWorld extends Karel {

        public void run() {
        }

        void turnRight() {
                turnLeft();
                turnLeft();
                turnLeft();
        }

}
