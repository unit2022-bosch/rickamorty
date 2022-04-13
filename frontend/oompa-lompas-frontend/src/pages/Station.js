import React from "react";
import useAuth from "../hooks/useAuth";
import {useParams} from "react-router-dom";

export default function Station() {
    const {token} = useAuth();
    const params = useParams();
    return (
        <>
            <h2>Station {params.stationId}</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}