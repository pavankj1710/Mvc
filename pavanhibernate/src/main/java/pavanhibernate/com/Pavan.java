package pavanhibernate.com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pavan {
	@Id
private int id;
private String name;
private long mob;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMob() {
	return mob;
}
public void setMob(long mob) {
	this.mob = mob;
}
@Override
public String toString() {
	return "Pavan [id=" + id + ", name=" + name + ", mob=" + mob + "]";
}


}
