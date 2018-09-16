package com.bjsxt.shopping.order;

import java.util.List;

public interface OrderDAO {
	/**
	 * 修改
	 * @param so
	 */
	public void update(SalesOrder so);
	/**
	 * 添加
	 * @param so
	 * @return
	 */
	public int add(SalesOrder so);
	/**
	 * 得到所有订单
	 * @return
	 */
	public List<SalesOrder> getOrders();
	/**
	 * 得到当前页的订单
	 * @param orders
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public int getOrders(List<SalesOrder> orders, int pageNo, int pageSize);
	/**
	 * 根据ID删除
	 * @param id
	 */
	public void delete(int id);
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 */
	public SalesOrder loadById(int id);
	/**
	 * 根据条件删除
	 * @param conditionStr
	 */
	public void delete(String conditionStr);
	/**
	 * 查找符合条件的订单
	 * @param products
	 * @param pageNo
	 * @param pageSize
	 * @param queryStr
	 * @return
	 */
	public int find(List<SalesOrder> products, int pageNo, int pageSize, String queryStr);
	/**
	 * 根据ID得到销售品
	 * @param orderId
	 * @return
	 */
	public List<SalesItem> getSalesItems(int orderId);
	/**
	 * 更新物品的状态
	 * @param order
	 */
	public void updateStatus(SalesOrder order);
	
}
