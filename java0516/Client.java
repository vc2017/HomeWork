package java0516;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java0516.MyConnection;



public class Client extends JFrame {
	
	public Client(Socket socket){
		super();
		this.setLayout(null);
		this.setTitle("群聊");
		//文本
		JTextArea jl = new JTextArea();
		
		jl.setBackground(Color.blue);
		jl.setEnabled(false);
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(0, 0, 500, 300);
		jl.setFont(new java.awt.Font("宋体",0,22));
		this.add(js);
		
		//输入框
		JTextField jtf = new JTextField();
		jtf.setBounds(0, 300, 500, 40);
		jtf.setFont(new java.awt.Font("宋体",0,20));
		this.add(jtf);
		//发送按钮
		JButton jb = new JButton("发送");
		jb.setBounds(200,361,80,30);
		jb.setFont(new java.awt.Font("宋体",0,22));
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取用户输入内容
				String nr = jtf.getText();
				
				if(!"".equals(nr)){
					//找到socket
					try {
						PrintWriter pw = new PrintWriter(socket.getOutputStream());
						//发送
						pw.write(nr+"\n");
						pw.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				//清空
				jtf.setText("");
			}
		});
		this.add(jb);
		//清空按钮
		JButton jb2 = new JButton("清空聊天记录");
		jb2.setBounds(370, 420, 120, 30);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("");
				
			}
		});
		this.add(jb2);
		//聊天按钮
				JButton jb3 = new JButton("查看聊天记录");
				jb3.setBounds(370, 360, 120, 30);
				jb3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame jf = new JFrame("聊天记录");
						jf.setLayout(null);
						JTextArea jTextArea = new JTextArea();
						jTextArea.setEnabled(false);
						JScrollPane js2 = new JScrollPane(jTextArea);
						js2.setBounds(0,0,500,500);
						jTextArea.setFont(new java.awt.Font("微软雅黑",0,19));
						jTextArea.setForeground(Color.red);
						jTextArea.setBackground(Color.black);
						jf.add(js2);	
						jf.setVisible(true);
						jf.setBounds(688, 270, 500, 500);
						//加载驱动
						try {
							Connection cnt = MyConnection.getIntance();
							ResultSet rs = null;
							rs = cnt.createStatement().executeQuery("select * from Talkout");
							while(rs.next()){
								//System.out.println(rs.getInt("id")+"\t"+rs.getString("nr"));
								jTextArea.setText(jTextArea.getText()+"\n"+rs.getInt("id")+"    "+rs.getString("nr"));
							}
						} catch (Exception v) {
							// TODO Auto-generated catch block
							v.printStackTrace();
						}
						
					}
				});
		this.add(jb3);
		//清除聊天记录
		JButton jb4 = new JButton("清除聊天记录");
		jb4.setBounds(0, 360, 120, 30);
		jb4.addActionListener(new ActionListener(
				) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cnt = MyConnection.getIntance();
					PreparedStatement ps = null;
					ps = cnt.prepareStatement("truncate table Talkout");
					ps.executeUpdate();
				} catch (Exception b) {
					// TODO Auto-generated catch block
					b.printStackTrace();
				}
			}
		});
		this.add(jb4);
		//提示按钮
		JLabel jl3 = new JLabel();
		jl3.setText("提示：第一次输入为用户名");
		jl3.setBounds( 0, 420, 200, 30);
		this.add(jl3);
		new Thread(new Int(socket,jl)).start();
		this.setBounds(200,200,500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String args [] ){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.238",10001);
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.write("张辉"+"\n");
			pw.flush();
			new Client(socket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
