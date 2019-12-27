package application;
public class Pedido {
	private int id;
	private OrderStatus order;

	public Pedido(int id, OrderStatus order) {
		this.id = id;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderStatus getOrder() {
		return order;
	}

	public void setOrder(OrderStatus order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", order=" + order + "]";
	}
	
	

}
