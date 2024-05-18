import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
public class smit implements ActionListener,MouseListener 
{
	JButton bta;
	JLabel info = new JLabel();
	JButtonbtb,tbc,btd,bte,btf,btg,bth,bti,btj,btk,btl,btm,btn,bto,btp,btq,btr,bts,btt,btu,btv,btw,btx,bty,btz;
	
	public smit(String name)
	{       
		JFrame jf = new JFrame();
		jf.setSize(900,500);
		jf.setVisible(true);
		jf.setLayout(new GridLayout(3,10));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon img = new ImageIcon("F:\\java mini project\\aa.png");
		bta = new JButton(img);
		
		bta.setText("A");
		bta.addActionListener(this);
		bta.addMouseListener(this);
		jf.add(bta);

		Icon imgb = new ImageIcon("F:\\java mini project\\bb.png");
		btb = new JButton(imgb);
		btb.setText("B");
		btb.setBackground(Color.WHITE);
		btb.addActionListener(this);
		btb.addMouseListener(this);
		jf.add(btb);
		
		Icon imgc = new ImageIcon("F:\\java mini project\\cc.png");
		btc = new JButton(imgc);
		btc.setText("C");
		btc.setBackground(Color.WHITE);
		btc.addMouseListener(this);
		btc.addActionListener(this);
		jf.add(btc);
		
		Icon imgd = new ImageIcon("F:\\java mini project\\dd.png");
		btd = new JButton(imgd);
		btd.setText("D");
		btd.setBackground(Color.WHITE);
		btd.addMouseListener(this);
		btd.addActionListener(this);
		jf.add(btd);
		
		Icon imge = new ImageIcon("F:\\java mini project\\ee.png");
		bte = new JButton(imge);
		bte.setText("E");
		bte.addMouseListener(this);
		bte.addActionListener(this);
		bte.setBackground(Color.WHITE);
		jf.add(bte);
		
		Icon imgf = new ImageIcon("F:\\java mini project\\ff.png");
		btf = new JButton(imgf);
		btf.setText("F");
		btf.addActionListener(this);
		btf.addMouseListener(this);
		btf.setBackground(Color.WHITE);
		jf.add(btf);
		
		Icon imgg = new ImageIcon("F:\\java mini project\\gg.png");
		btg = new JButton(imgg);
		btg.setText("G");
		btg.addMouseListener(this);
		btg.addActionListener(this);
		jf.add(btg);
		
		Icon imgh = new ImageIcon("F:\\java mini project\\hh.png");
		bth = new JButton(imgh);
		bth.setText("H");
		bth.addMouseListener(this);
		bth.addActionListener(this);
		jf.add(bth);
		
		Icon imgi = new ImageIcon("F:\\java mini project\\ii.png");
		bti = new JButton(imgi);
		bti.setText("I");
		bti.addMouseListener(this);
		bti.addActionListener(this);
		jf.add(bti);
		
		Icon imgj = new ImageIcon("F:\\java mini project\\jj.png");
		btj = new JButton(imgj);
		btj.setText("J");
		btj.addMouseListener(this);
		btj.addActionListener(this);
		jf.add(btj);
		
		Icon imgk = new ImageIcon("F:\\java mini project\\kk.png");
		btk = new JButton(imgk);
		btk.setBackground(Color.WHITE);
		btk.setText("K");
		btk.addMouseListener(this);
		btk.addActionListener(this);
		jf.add(btk);
		
		Icon imgl = new ImageIcon("F:\\java mini project\\ll.png");
		btl = new JButton(imgl);
		btl.addMouseListener(this);
		btl.setText("L");
		btl.addActionListener(this);
		jf.add(btl);
		
		Icon imgm = new ImageIcon("F:\\java mini project\\mm.png");
		btm = new JButton(imgm);
		btm.setText("M");
		btm.addMouseListener(this);
		btm.setBackground(Color.WHITE);
		btm.addActionListener(this);
		jf.add(btm);
		
		Icon imgn = new ImageIcon("F:\\java mini project\\nn.png");
		btn = new JButton(imgn);
		btn.addMouseListener(this);
		btn.setText("N");
		btn.setBackground(Color.WHITE);
		btn.addActionListener(this);
		jf.add(btn);
		
		Icon imgo = new ImageIcon("F:\\java mini project\\oo.png");
		bto = new JButton(imgo);
		bto.setText("O");
		bto.addMouseListener(this);
		bto.addActionListener(this);
		jf.add(bto);
		
		Icon imgp = new ImageIcon("F:\\java mini project\\pp.png");
		btp = new JButton(imgp);
		btp.addMouseListener(this);
		btp.setText("P");
		btp.addActionListener(this);
		jf.add(btp);
		
		Icon imgq = new ImageIcon("F:\\java mini project\\qq.png");
		btq = new JButton(imgq);
		btq.setText("Q");
		btq.addActionListener(this);
		btq.addMouseListener(this);
		jf.add(btq);
		
		Icon imgr = new ImageIcon("F:\\java mini project\\rr.png");
		btr = new JButton(imgr);
		btr.setText("R");
		btr.addActionListener(this);
		btr.addMouseListener(this);
		btr.setBackground(Color.WHITE);
		jf.add(btr);
		
		Icon imgs = new ImageIcon("F:\\java mini project\\ss.png");
		bts = new JButton(imgs);
		bts.setText("S");
		bts.addMouseListener(this);
		bts.setBackground(Color.WHITE);
		bts.addActionListener(this);
		jf.add(bts);
		
		Icon imgt = new ImageIcon("F:\\java mini project\\tt.png");
		btt = new JButton(imgt);
		btt.setText("T");
		btt.addMouseListener(this);
		btt.addActionListener(this);
		jf.add(btt);
		
		Icon imgu = new ImageIcon("F:\\java mini project\\uu.png");
		btu = new JButton(imgu);
		btu.setText("U");
		btu.addActionListener(this);
		btu.addMouseListener(this);
		jf.add(btu);
		
		Icon imgv = new ImageIcon("F:\\java mini project\\vv.png");
		btv = new JButton(imgv);
		btv.setText("V");
		btv.addActionListener(this);
		btv.addMouseListener(this);
		btv.setBackground(Color.WHITE);
		jf.add(btv);
		
		Icon imgw = new ImageIcon("F:\\java mini project\\ww.png");
		btw = new JButton(imgw);
		btw.setText("W");
		btw.addMouseListener(this);
		btw.addActionListener(this);
		btw.setBackground(Color.WHITE);
		jf.add(btw);
		
		Icon imgx = new ImageIcon("F:\\java mini project\\xx.png");
		btx = new JButton(imgx);
		btx.setText("X");
		btx.addActionListener(this);
		btx.addMouseListener(this);
		btx.setBackground(Color.WHITE);
		jf.add(btx);
		
		Icon imgy = new ImageIcon("F:\\java mini project\\yy.png");
		bty = new JButton(imgy);
		bty.setBackground(Color.WHITE);
		bty.setText("Y");
		bty.addMouseListener(this);
		bty.addActionListener(this);
		jf.add(bty);
		
		Icon imgz = new ImageIcon("F:\\java mini project\\zz.png");
		btz = new JButton(imgz);
		btz.setText("Z");
		btz.addMouseListener(this);
		btz.addActionListener(this);
		btz.setBackground(Color.WHITE);
		jf.add(btz);


		info.setText("                         Hello");
		jf.add(info);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{	
		try
		{
		
		if(ae.getSource().equals(bta))
		{	File soundfile = new File("F:\\java mini project\\a.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btb))
		{	File soundfile = new File("F:\\java mini project\\b.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btc))
		{	File soundfile = new File("F:\\java mini project\\c.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btd))
		{	File soundfile = new File("F:\\java mini project\\d.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(bte))
		{	File soundfile = new File("F:\\java mini project\\e.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btf))
		{	File soundfile = new File("F:\\java mini project\\f.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btg))
		{	File soundfile = new File("F:\\java mini project\\g.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(bth))
		{	File soundfile = new File("F:\\java mini project\\h.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(bti))
		{	File soundfile = new File("F:\\java mini project\\i.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btj))
		{	File soundfile = new File("F:\\java mini project\\j.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btk))
		{	File soundfile = new File("F:\\java mini project\\k.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btl))
		{	File soundfile = new File("F:\\java mini project\\l.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btm))
		{	File soundfile = new File("F:\\java mini project\\m.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btn))
		{	File soundfile = new File("F:\\java mini project\\n.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(bto))
		{	File soundfile = new File("F:\\java mini project\\o.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btp))
		{	File soundfile = new File("F:\\java mini project\\p.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btq))
		{	File soundfile = new File("F:\\java mini project\\q.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btr))
		{	File soundfile = new File("F:\\java mini project\\r.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(bts))
		{	File soundfile = new File("F:\\java mini project\\s.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btt))
		{	File soundfile = new File("F:\\java mini project\\t.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btu))
		{	File soundfile = new File("F:\\java mini project\\u.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btv))
		{	File soundfile = new File("F:\\java mini project\\v.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btw))
		{	File soundfile = new File("F:\\java mini project\\w.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btx))
		{	File soundfile = new File("F:\\java mini project\\x.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(bty))
		{	File soundfile = new File("F:\\java mini project\\y.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}
		if(ae.getSource().equals(btz))
		{	File soundfile = new File("F:\\java mini project\\z.wav");
		AudioInputStream ai = AudioSystem.getAudioInputStream(soundfile);
		Clip c = AudioSystem.getClip();
		c.open(ai);
		c.start();
		}

	}
	catch(Exception e)
{

}}
	public void mouseClicked(MouseEvent mee)
	{

	}
	public void mouseExited(MouseEvent mee)
	{

	}
	public void mousePressed(MouseEvent mee)
	{

	}
	public void mouseReleased(MouseEvent mee)
	{

	}
	public void mouseEntered(MouseEvent mee)
	{
		if(mee.getSource().equals(bta))
		{
			info.setText("         A for Apple .");
		}
		if(mee.getSource().equals(btb))
		{
			info.setText("         B for BaseBall .");
		}
		if(mee.getSource().equals(btc))
		{
			info.setText("         C for Cat .");
		}
		if(mee.getSource().equals(btd))
		{
			info.setText("         D for Donkey .");
		}
		if(mee.getSource().equals(bte))
		{
			info.setText("         E for Elephant .");
		}
		if(mee.getSource().equals(btf))
		{
			info.setText("         F for Father .");
		}
		if(mee.getSource().equals(btg))
		{
			info.setText("         G for Grandmother .");
		}
		if(mee.getSource().equals(bth))
		{
			info.setText("         H for Hungry .");
		}
		if(mee.getSource().equals(bti))
		{
			info.setText("         I for Internet .");
		}
		if(mee.getSource().equals(btj))
		{
			info.setText("         J for Justice .");
		}
		if(mee.getSource().equals(btk))
		{
			info.setText("         K for Kangaroo .");
		}
		if(mee.getSource().equals(btl))
		{
			info.setText("         L for London .");
		}
		if(mee.getSource().equals(btm))
		{
			info.setText("         M for Monkey .");
		}
		if(mee.getSource().equals(btn))
		{
			info.setText("         N for Norway .");
		}
		if(mee.getSource().equals(bto))
		{
			info.setText("         O for Overtime .");
		}
		if(mee.getSource().equals(btp))
		{
			info.setText("         P for Pillow .");
		}
		if(mee.getSource().equals(btq))
		{
			info.setText("         Q for Questions .");
		}if(mee.getSource().equals(btr))
		{
			info.setText("         R for Rabbit .");
		}
		if(mee.getSource().equals(bts))
		{
			info.setText("         S for Superman .");
		}
		if(mee.getSource().equals(btt))
		{
			info.setText("         T for Telephone .");
		}
		if(mee.getSource().equals(btu))
		{
			info.setText("         U for Underwear .");
		}
		if(mee.getSource().equals(btv))
		{
			info.setText("         V for Vaccinate .");
		}
		if(mee.getSource().equals(btw))
		{
			info.setText("     W for World Wide Web .");
		}
		if(mee.getSource().equals(btx))
		{
			info.setText("         X for Xylophone .");
		}
		if(mee.getSource().equals(bty))
		{
			info.setText("         Y for Yogurt .");
		}
		if(mee.getSource().equals(btz))
		{
			info.setText("         Z for Zebra .");
		}


	}
	public static void main(String args[])
	{
		smit s1 = new smit("Alphabets ");
	}
	
}
