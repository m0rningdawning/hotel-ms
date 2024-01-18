import React, { createContext, useContext, useState } from "react";

//@ts-ignore
const Context = createContext();

type UserContextType = {
  user: any;
  isLoggedIn: any;
  login: (userData: any) => void;
  logout: () => void;
  readCredentials: () => void;
};

export const UserProvider = ({ children }: { children: React.ReactNode }) => {
  const [user, setUser] = useState(null);

  const login = (userData: any) => {
    setUser(userData);
  };

  const logout = () => {
    setUser(null);
  };

  const isLoggedIn = () => {
    return !!user;
  };

  return (
    <Context.Provider
      value={{ user, login, logout, isLoggedIn }}
    >
      {children}
    </Context.Provider>
  );
};

export const useUser = (): UserContextType => {
  return useContext(Context) as UserContextType;
};
