package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

class Car{
    public String name;
    public int imageResource;

}
class TagCar{
    public TextView name;
    public ImageView image;
}
public class MainActivity extends AppCompatActivity {
    private ListView listOfCars;
    CarAdapter carAdapter;
        private ExitText addNewCar;
        private Button addButton;
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listOfCars = findViewById(R.id.lv_list_cars);
        carAdapter = new CarAdapter(this);
        listOfCars.setAdapter(carAdapter);
        carAdapter.addCar("Ford", R.drawable.lab5_car_icon);
        carAdapter.addCar("Porche", R.drawable.lab5_car_icon);
        carAdapter.addCar("Dacia", R.drawable.lab5_car_icon);
        carAdapter.addCar("BMW", R.drawable.lab5_car_icon);

        addNewCar = findViewById(R.id.new_car);
        addButton = findViewById(R.id.add_car);
        addButton.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String name = addNewCar.getText().toString();
                int image = R.drawable.lab5_car_icon;
                carAdapter.addCar(name, image);
                addNewCar.setText("");
            }

        });
    }
}


