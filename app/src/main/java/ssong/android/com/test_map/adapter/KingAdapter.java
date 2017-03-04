package ssong.android.com.test_map.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import ssong.android.com.test_map.Kings;
import ssong.android.com.test_map.R;

/**
 * Created by antaehyeong on 2017. 2. 1..
 */

public class KingAdapter extends BaseAdapter {

    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Kings> kings = null;
    private LayoutInflater inflater = null;

    public KingAdapter(Context c, int l, ArrayList<Kings> k){
        this.mContext = c;
        this.kings = k;
        this.layout = l;
        this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return kings.size();
    }

    @Override
    public Object getItem(int position) {
        return kings;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = inflater.inflate(this.layout,parent,false);

        }
        TextView kings_Name = (TextView) convertView.findViewById(R.id.kings_name);
        TextView kings_realName = (TextView) convertView.findViewById(R.id.kings_realName);
        TextView kings_BornDead = (TextView) convertView.findViewById(R.id.kings_bornAndDead);

        kings_Name.setText(kings.get(position).kName);
        kings_realName.setText(kings.get(position).kRealName);
        kings_BornDead.setText(kings.get(position).kBornNdead);

        return convertView;
    }
}
