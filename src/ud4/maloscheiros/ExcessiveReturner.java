package ud4.maloscheiros;

public class ExcessiveReturner {

    public String processOrder(int quantity, double price) {
        if (quantity <= 0) {
            return "Invalid quantity";
        }

        if (price <= 0) {
            return "Invalid price";
        }

        if (quantity < 10) {
            return "Small order";
        }

        if (quantity >= 10 && quantity <= 100) {
            return "Medium order";
        }

        if (quantity > 100) {
            return "Large order";
        }

        return "Unknown order type";  // Este caso nunca debería alcanzarse
    }

    public static void main(String[] args) {
        ExcessiveReturner er = new ExcessiveReturner();
        System.out.println(er.processOrder(5, 10));  // Output: Small order
        System.out.println(er.processOrder(50, 10)); // Output: Medium order
        System.out.println(er.processOrder(200, 10)); // Output: Large order
    }
}
