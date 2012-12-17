package com.learn.basic;
import java.net.*;
import java.util.Enumeration;
public class InetAddressExample {

	public static void main(String[] args)
	{
		try{
			Enumeration<NetworkInterface> interfacelist=NetworkInterface.getNetworkInterfaces();
			if(interfacelist==null)
			{
				System.out.println("---No Found Interface--");
				
			}
			else
			{
				while(interfacelist.hasMoreElements())
				{
				NetworkInterface iface=	interfacelist.nextElement();
					System.out.println("interface:"+iface.getName());
					Enumeration<InetAddress> addresslist=iface.getInetAddresses();
					if(!addresslist.hasMoreElements())
					{
						System.out.println("No Found address");
					}
					while(addresslist.hasMoreElements())
					{
						InetAddress address=addresslist.nextElement();
						System.out.println("\tAddress "+((address instanceof Inet4Address ?"(v4)":(address instanceof Inet6Address ?"(v6)":"(?)"))));
						System.out.println(":"+address.getHostAddress());
					}
				}
				
			}
		}
		catch(SocketException se)
		{
			System.out.println("Error getting network interfaces:"+se.getMessage());
			
		}
		for(String host:args)
		{
			try{
				System.out.println(host+":");
			InetAddress[] addresslist=InetAddress.getAllByName(host);
				for(InetAddress address:addresslist){
					System.out.println("\t"+address.getHostName()+"/"+address.getHostAddress());
				}
			}
			catch(UnknownHostException e)
			{
				System.out.println("\tUnable to find address for"+host);
			}
		}
	}
	
}
