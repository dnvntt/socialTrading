package vn.com.vndirect.socialtrading.dao;


import java.util.List;

interface Dao <EntityType, KeyType> {
    List<EntityType> all();
    EntityType get(KeyType id) throws NotFoundException;
    boolean save(EntityType object);
    boolean insert(EntityType object);
    boolean delete(EntityType object);
}
