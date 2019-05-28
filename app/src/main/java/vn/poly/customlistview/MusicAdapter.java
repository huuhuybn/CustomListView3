package vn.poly.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MusicAdapter extends BaseAdapter {


    private List<Music> musicList;
    private Context context;

    // ham tao
    public MusicAdapter(Context context,List<Music> musicList){
        this.musicList = musicList;
        this.context = context;

    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int position) {
        return musicList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.row,parent,false);

        TextView tvName = convertView.findViewById(R.id.tvName);

        TextView tvTime = convertView.findViewById(R.id.tvTime);

        ImageView imgPlay = convertView.findViewById(R.id.imgPlay);

        final Music music = musicList.get(position);


        tvName.setText(music.getName());
        tvTime.setText(music.getTime());


        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,music.getName(),Toast.LENGTH_SHORT).show();

                musicList.remove(position);
                notifyDataSetChanged();
            }
        });



        return convertView;
    }
}
