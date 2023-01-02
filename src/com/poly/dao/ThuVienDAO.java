
package com.poly.dao;

import java.util.List;

public abstract class ThuVienDAO<EntityType, KeyType> {
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(KeyType id);
    abstract public EntityType selectById(KeyType id);
    abstract public List<EntityType> select();
    abstract protected List<EntityType> select(String sql, Object... args);
}
