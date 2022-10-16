// ignore_for_file: camel_case_types

class emp {
  String n = "";
  emp(String n) {
    this.n = n;
  }
  void show() {
    print("name: $n");
  }
}

class sal extends emp {
  int s = 0;
  sal(String name, int s) : super(name) {
    this.s = s;
  }
  void show() {
    super.show();
    print("Salary: $s");
  }
}

void main() {
  sal obj = new sal("ravi", 25000);
  obj.show();
}
