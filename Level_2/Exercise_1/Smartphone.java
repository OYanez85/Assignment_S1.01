public class Smartphone extends Phone implements Camera, Watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takingapicture() {
        System.out.println("He is taking a picture");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm is buzzing");
    }
}
