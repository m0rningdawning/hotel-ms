import React from "react";
import LoginForm from "../../components/login-form/LoginForm";
import HmsFooter from "../../components/footer/HmsFooter";
import HmsHeader from "../../components/header/HmsHeader";
import "./Login.css";

const Login = () => {
  return (
    <>
      <HmsHeader />
      <LoginForm />
      <HmsFooter />
    </>
  );
};

export default Login;
