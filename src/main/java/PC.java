public class PC {
    public static Object powerUp;
    protected String pcCase;
    protected String motherboard;
    protected String monitor;

    public PC(String pcCase, String monitor, String motherboard){
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private static void drawLogo(){
        //invokes drawPixel(z, y, z)
            Monitor.drawPixel(80, 40, "Green");
        }

        public void description(){
            System.out.println("Welcome to worst buy, below is the description " +
                    "of the pc on sale today\n"+ "An " + motherboard + "motherboard inside of a " +
                    pcCase + ", and a " + monitor + "monitor");
        }

        public static void powerUp(){
        //invokes powerUp, drawLogo, loadProgram
            drawLogo();
            Motherboard.loadProgram("Windows");
        }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase='" + pcCase + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
