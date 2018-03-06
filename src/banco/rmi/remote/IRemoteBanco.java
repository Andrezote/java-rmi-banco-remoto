package banco.rmi.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.Instant;

public interface IRemoteBanco extends Remote{
	
	public void saque(double valor, int id, Instant data)throws RemoteException;
	public void deposito(double valor, int id)throws RemoteException;
	public double saldo(int id)throws RemoteException;
}
