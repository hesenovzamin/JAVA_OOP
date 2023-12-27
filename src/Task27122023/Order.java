package Task27122023;

import java.util.List;

public class Order {
    private List<OrderDetails> orderDetailsList;

    public void addProduct(Product product,int quantity){
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setProduct(product);
        orderDetails.setQuantity(quantity);
        orderDetailsList.add(orderDetails);
    }
    public double getTotalAmount() {
        double totalprice = 0;
        for (int i = 0;i < orderDetailsList.size();i++){
            totalprice+= orderDetailsList.get(i).getTotalPrice();
        }
        return totalprice;
    }
}
