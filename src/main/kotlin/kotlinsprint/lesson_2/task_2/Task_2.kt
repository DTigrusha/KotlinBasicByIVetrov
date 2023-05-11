package kotlinsprint.lesson_2.task_2

fun main() {
    val numberOfEmployees = 50
    val salaryOfEmployee = 30000
    val numberOfInterns = 30
    val salaryOfIntern = 20000
    val salaryOfEmployeesExpenses = numberOfEmployees * salaryOfEmployee
    val totalSalaryExpenses = salaryOfEmployeesExpenses + (numberOfInterns * salaryOfIntern)
    val averageSalary = totalSalaryExpenses / (numberOfEmployees + numberOfInterns)

    println("$salaryOfEmployeesExpenses\n$totalSalaryExpenses\n$averageSalary")
}