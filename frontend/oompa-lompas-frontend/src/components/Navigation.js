import {NavLink} from "react-router-dom";
import React from "react";
import useAuth from "../hooks/useAuth";

export default function Navigation() {
    const {token, onLogout} = useAuth();
    return token && (
        <nav>
            <NavLink to="/admin">Admin</NavLink>
            <NavLink to="/logistic">Logistic</NavLink>
            <NavLink to="/warehouse">Warehouse</NavLink>
            <NavLink to="/station">Stations</NavLink>
            <button type="button" onClick={onLogout}>
                Sign Out
            </button>
        </nav>
    );
}