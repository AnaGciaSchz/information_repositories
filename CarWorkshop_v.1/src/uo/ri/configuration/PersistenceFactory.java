package uo.ri.configuration;

import uo.ri.persistencia.BreakdownGateway;
import uo.ri.persistencia.InvoiceGateway;
import uo.ri.persistencia.MechanicGateway;
import uo.ri.persistencia.implementation.BreakdownGatewayImpl;
import uo.ri.persistencia.implementation.InvoiceGatewayImpl;
import uo.ri.persistencia.implementation.MechanicGatewayImpl;

public class PersistenceFactory {
	public static MechanicGateway getMechanicGateway() {
		return new MechanicGatewayImpl();
	}
	
	public static BreakdownGateway getBreakDownGateway() {
		return new BreakdownGatewayImpl();
	}
	
	public static InvoiceGateway getInvoiceGateway() {
		return new InvoiceGatewayImpl();
	}
}
