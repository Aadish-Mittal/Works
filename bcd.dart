import 'dart:io';

class emp {
  String ename = "", eid = "";
  void get() {
    ename = "abc";
    eid = '1001';
  }

  void put() {
    print("ename= $ename eid= $eid");
  }
}

class data extends emp {
  int sal = 0;
  void input() {
    sal = 12000;
    super.get();
  }

  void output() {
    super.put();
    print("Salary $sal");
  }
}

void main() {
  data obj = new data();
  obj.input();
  obj.output();
}
