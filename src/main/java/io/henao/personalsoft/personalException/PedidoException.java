package io.henao.personalsoft.personalException;

import io.henao.personalsoft.empresaLeonisa.Producto;

import java.util.ArrayList;

public class PedidoException extends Exception{

    public PedidoException(ArrayList<Producto> productoArr){
        super("El pedido no contiene ningún producto | Cantidad: " + productoArr.size());
    }
}
