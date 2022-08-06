public class Truck extends Transport{
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("4 покрышки сменено");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkTransport() {
        checkEngine();
        checkTrailer();
        System.out.println("С грузовиком все ок");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}