
package fr.imie.cours;

import java.util.List;

public class ProductDAO implements DAO<Product> {

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		List<Product> findAll = new ProductDAO().findAll();
		for (Product p : findAll) {

		}
	}

	@Override
	public Product findOne(Product data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product insert(Product data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Product> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}