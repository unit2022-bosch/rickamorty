import React from 'react';
import Particles from "react-tsparticles";
import './App.css';
import particlesOptions from "./particles.json";
import {Route, Routes} from 'react-router-dom';
import Navigation from "./components/Navigation";
import AuthProvider from "./components/AuthProvider";
import ProtectedRoute from "./components/ProtectedRoute";
import Admin from "./pages/Admin";
import NoMatch from "./pages/NoMatch";
import Station from "./pages/Station";
import Stations from "./pages/Stations";
import Logistic from "./pages/Logistic";
import Warehouse from "./pages/Warehouse";
import Login from "./pages/Login";

export default function App() {

    return (
        <AuthProvider>
            <Particles options={particlesOptions}/>
            <h1>React Router</h1>
            <Navigation/>
            <Routes>
                <Route index element={<Login />} />
                <Route path="login" element={<Login/>}/>
                <Route
                    path="admin"
                    element={
                        <ProtectedRoute>
                            <Admin/>
                        </ProtectedRoute>
                    }
                />
                <Route
                    path="warehouse"
                    element={
                        <ProtectedRoute>
                            <Warehouse/>
                        </ProtectedRoute>
                    }
                />
                <Route
                    path="logistic"
                    element={
                        <ProtectedRoute>
                            <Logistic/>
                        </ProtectedRoute>
                    }
                />
                <Route
                    path="station"
                    element={
                        <ProtectedRoute>
                            <Stations/>
                        </ProtectedRoute>
                    }
                >
                </Route>
                <Route
                    path="station/:stationId"
                    element={
                        <ProtectedRoute>
                            <Station/>
                        </ProtectedRoute>}
                />
                <Route path="*" element={<NoMatch/>}/>
            </Routes>
        </AuthProvider>
    );
};
