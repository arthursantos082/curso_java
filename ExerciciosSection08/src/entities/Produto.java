//classe para os produtos
//utilizando seus metodos e atribuindo os valores inseridos pelo usuario no prog. principal

package entities;

public class Produto {
    public String name;
    public double price;
    public int quantity;


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name +
                " " +
                String.format("%.2f", price) +
                " " +
                quantity +
                " " +
                String.format("%.2f", totalValueInStock());
    }
}
