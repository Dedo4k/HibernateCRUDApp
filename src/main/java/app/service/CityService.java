package app.service;

import app.dao.CityDaoImpl;
import app.model.City;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class CityService {

    private final CityDaoImpl cityDao;

    public CityService() {
        this.cityDao = new CityDaoImpl();
    }

    public void create(City city) {
        cityDao.create(city);
    }

    public City getById(Long id) {
        return (City) cityDao.read(id);
    }

    public List<?> getAll() {
        return cityDao.readAll();
    }

    public void update(City city) {
        cityDao.update(city);
    }

    public void deleteById(Long id) {
        cityDao.delete(getById(id));
    }
}
