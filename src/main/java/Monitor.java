public class Monitor {
    protected String Resolution;
    private String manufacturer;
    private String model;

    public Monitor(String model, String manufacturer){

    }

    public static void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at "+ x + "," + y + " " + " in color "+ color);
    }
}
