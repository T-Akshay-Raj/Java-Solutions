package java_essentials.model.record;

public record EmployeeRecord(PersonRecord PR, String designation, int empId, int deptId) {
}
