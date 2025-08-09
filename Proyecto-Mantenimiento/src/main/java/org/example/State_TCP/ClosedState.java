package org.example.State_TCP;

public class ClosedState implements TCPState{
    @Override
    public void open(TCPConnection connection) {
        connection.getLogger().log("Opening connection...");
        connection.setState(new OpenState());
    }
    @Override
    public void close(TCPConnection connection) {
        connection.getLogger().log("Already closed.");
    }
}
