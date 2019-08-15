package br.sp.senac.personagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonagensActivity extends AppCompatActivity {

    GridView gridView;

    String[] nomePerso = {"Oliver Queen", "Felicity Smoak", " John Diggle", "Canário", "Nyssa", "Thea Queen", " Roy Harper", "Ray Palmer", "Malcom Merlyn", "Exterminador"};
    int[] imagePerso = {R.drawable.oliverr, R.drawable.felicity_smoak, R.drawable.diggle, R.drawable.canario, R.drawable.nyssa, R.drawable.thea_queen, R.drawable.roy_harper, R.drawable.ray_palmer, R.drawable.malcom_merlyn, R.drawable.exterminador};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        gridView = (GridView) findViewById(R.id.gridView);

        CustomAdapter customAdater = new CustomAdapter();
        gridView.setAdapter(customAdater);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), GridItemActivity.class);
                intent.putExtra("name", nomePerso[position]);
                intent.putExtra("image", imagePerso[position]);
                startActivity(intent);

            }
        });
    }

    public class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imagePerso.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data, null);

            TextView name = view1.findViewById(R.id.txtPersonagens);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(nomePerso[position]);
            image.setImageResource(imagePerso[position]);

            return view1;

        }
    }
}


