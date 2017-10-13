package com.stu.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

import com.stu.inventedteam.R;
//�˳���ť������
public class MyExitButton extends Button implements OnTouchListener //ͨ��ʵ�ֽӿ���ʵ�ּ����¼�
{
	public MyExitButton(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		setTextColor(Color.WHITE);
		setBackgroundResource(R.drawable.common_button_red);
		setOnTouchListener(this);
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		switch (event.getAction())
		{
			case MotionEvent.ACTION_DOWN:
				v.setBackgroundResource(R.drawable.common_button_red_highlighted);
				break;
			case MotionEvent.ACTION_UP:
				v.setBackgroundResource(R.drawable.common_button_red);
				break;
			default:
				break;
		}
		return false;
	}
}