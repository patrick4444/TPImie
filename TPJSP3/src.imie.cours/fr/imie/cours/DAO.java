package fr.imie.cours;

import java.util.List;

public interface DAO<T> {

	public List<T> findAll();

	public T findOne(T data);

	public T findOne(Integer id);

	public T insert(T data);

	public void update(T data);

	public void delete(T data);

	public void delete(Integer id);

	public void delete(List<T> data);

	public void deleteAll();

}