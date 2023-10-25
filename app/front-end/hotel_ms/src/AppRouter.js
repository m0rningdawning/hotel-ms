import React from "react";
import { BrowserRouter as Router, Routes, Route, Navigate } from "react-router-dom";
import Home from "./components/Home/Home";
import Admin from "./components/Admin/Admin";

const AppRouter = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/home" element={<Home />} />
        <Route path="/" element={<Navigate replace to="/home" />} />
        <Route path="/admin" element={<Admin />} />
      </Routes>
    </Router>
  );
};

export default AppRouter;
