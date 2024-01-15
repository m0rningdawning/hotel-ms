import React from "react";
import AppRouter from "./AppRouter";
import { UserProvider } from "./components/context/Context";
import "./App.css";

const App = () => {
  return (
    <UserProvider>
      <div className="App">
        <AppRouter />
      </div>
    </UserProvider>
  );
};

export default App;
