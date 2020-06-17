import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TroGiup extends Frame implements ActionListener
{
	Label lbTroGiup = new Label("TRỢ GIÚP",Label.CENTER);
	TextArea txaTroGiup = new TextArea();
	Button buttThoat = new Button("Thoát");
	public TroGiup(String title)
	{
		super(title);
		lbTroGiup.setFont(new Font("Tahoma",Font.BOLD,20));
		add(lbTroGiup,BorderLayout.NORTH);
		txaTroGiup.setEditable(false);
		txaTroGiup.setText("\t\tCHƯƠNG TRÌNH QUẢN LÝ QUÁN CAFE\n\t\t\tCoffee Manager V1.0\n Đây là chương trình giúp cho việc quản lý quán cafe dễ dàng, chính xác hơn.\nChương trình này bao gồm các chức nắng cơ bản như sau:\nNhập Danh Sách những món mà khách hàng muốn gọi.\nSửa đổi món mà khách hàng đã gọi trước đó. \nNếu khách có nhu cầu tách bàn(ví du anh chị nào đó muốn đánh lẻ...).\nTính tiền một cách chính xác cho từng bàn.\nVà rất nhiều tính năng khác cho mọi người khám phá..." );
		add(txaTroGiup,BorderLayout.CENTER);
		add(buttThoat,BorderLayout.SOUTH);
		buttThoat.addActionListener(this);
		setFont(new Font("Times New Roman",Font.PLAIN,15));
		setBounds(120, 100,600,280);
		setResizable(false);
		//pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == buttThoat)
			setVisible(false);
	}


}
