public class Car extends Transport{
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
        System.out.println("Меняем покрышку у машины");
        System.out.println("Меняем покрышку у машины");
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void checkTransport() {
        checkEngine();
        System.out.println("С машиной все ок");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
