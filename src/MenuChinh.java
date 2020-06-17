import java.awt.*;
import java.awt.event.*;
public class MenuChinh
{
	public static void main(String[] args)
	{
		createMenu();
	}
	private static void createMenu()
	{
		//tao frame cho chuong trinh
		final Frame fr = new Frame("Chương Trình Quản Lý Quán Cafe");
		fr.setLayout(new BorderLayout());
		//tao Menu Bar
		MenuBar menu = new MenuBar();
		//tao cac Menu
		Menu menuFile = new Menu("File");
		Menu menuUpdate = new Menu("Cập Nhật");
		Menu menuProcess = new Menu("Xử Lý");
		Menu menuHelp = new Menu("Help");
		//tao Menu Item cho File
		MenuItem trangThai = new MenuItem("Trạng Thái Bàn");
		trangThai.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new TrangThai("Trạng Thái Bàn");
			}
		});
		MenuItem goiMon = new MenuItem("Gọi Món");
		goiMon.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new GoiMon("Gọi Món");
			}
		});
		MenuItem tinhTien = new MenuItem("Tính Tiền");
		tinhTien.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new TinhTien("tính Tiền");
			}
		});
		MenuItem thoat = new MenuItem("Thoát");
		thoat.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
		menuFile.add(trangThai);
		menuFile.add(goiMon);
		menuFile.add(tinhTien);
		menuFile.addSeparator();
		menuFile.add(thoat);
		//tao Menu Item cho Update
		MenuItem themBan = new MenuItem("Danh Sách Bàn");
		themBan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new ThemBan("Danh Sách Bàn");
			}
		});
		MenuItem themThucDon = new MenuItem("Thực Đơn");
		themThucDon.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new ThucDon("Thực Đơn");
			}
		});
		menuUpdate.add(themBan);
		menuUpdate.add(themThucDon);
		//tao Menu Item cho Process
		//tao Menu Item cho Help
		MenuItem troGiup = new MenuItem("Trợ Giúp");
		troGiup.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new TroGiup("Trợ Giúp");
			}
		});
		MenuItem about = new MenuItem("About");
		about.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new About("About");
			}
		});
		menuHelp.add(troGiup);
		menuHelp.add(about);
		//gan cac Menu vao MenuBar
		menu.add(menuFile);
		menu.add(menuUpdate);
		MenuItem thayDoi  = new MenuItem("Thay Đổi Món");
		thayDoi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new ThemMon("Thay Đổi Món");
			}
		});
		MenuItem ghepBan  = new MenuItem("Ghép Bàn");
		ghepBan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new GhepBan("Ghép bàn");
			}
		});
		menuProcess.add(thayDoi);
		menuProcess.add(ghepBan);
		menu.add(menuProcess);
		menu.add(menuHelp);
		//gan MenuBar vao khung
		fr.setMenuBar(menu);
		Label lb = new Label("CHƯƠNG TRÌNH QUẢN LÝ QUÁN CAFE",Label.CENTER);
		lb.setFont(new Font("Times Roman",Font.BOLD,30));
		fr.add(lb,BorderLayout.CENTER);
		fr.setBounds(0,0, 800, 570);
		fr.setVisible(true);
		fr.setFont(new Font("Arial",Font.PLAIN,13));
		//xu ly su kien dong cua so ung dung
		fr.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}	
				});
	}
}
