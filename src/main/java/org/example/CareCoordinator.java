package org.example;

public class CareCoordinator {
  String id;

  String hash;

  int count;

  public CareCoordinator(String id, int count) {
    this.id = id;
    this.count = count;
    this.hash = String.format("%0" + 10 + "d", count)+"/"+id;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
    this.hash = String.format("%0" + 10 + "d", count)+"/"+id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CareCoordinator{" +
        "id=" + id +
        ", hash='" + hash + '\'' +
        ", count=" + count +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    CareCoordinator that = (CareCoordinator) o;

    return hash.equals(that.hash);
  }

  @Override
  public int hashCode() {
    return hash.hashCode();
  }
}
