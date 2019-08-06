public class Main {
    public static void main(String[] args) {

        Bus Nefaz = new Bus();

        try {
            Nefaz.setCapacity(50);
            Nefaz.setPrice(555);
            Nefaz.setMark(null);
        }catch (CapacityException e) {
            e.printStackTrace();
        }catch (NegativePrice i){
            i.printStackTrace();
        } catch (NullMarkException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Cообщение finally");
        }


    }
}