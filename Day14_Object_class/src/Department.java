public class Department {
    String departmentName;

    public Department(){

    }

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
    //     return result;
    // }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Department)) return false;

        Department other = (Department) obj;
        return this.departmentName.equals(other.departmentName);
    }

    
}
