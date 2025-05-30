package javaStudy.day5;

import java.rmi.RemoteException;

import javaStudy.day4_interface.RemotControl;

/*
 * 기존의 interface 를 모두 상속받는 interface
 */
public interface TheLastInterface extends RemotControl,Searchable {
	

}
