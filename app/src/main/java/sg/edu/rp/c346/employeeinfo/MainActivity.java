package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    ArrayList<EmployeeItem> alEmployee;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItem = findViewById(R.id.listViewEmployee);
        alEmployee = new ArrayList<>();
        EmployeeItem item1 = new EmployeeItem("John", "Software Technical Leader", Float.parseFloat("3400"));
        EmployeeItem item2 = new EmployeeItem("May", "Programmer", Float.parseFloat("2200"));
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        alEmployee.add(item1);
        alEmployee.add(item2);
        caEmployee = new CustomAdapter(this, R.layout.employee_items, alEmployee);
        lvItem.setAdapter(caEmployee);
    }
}
