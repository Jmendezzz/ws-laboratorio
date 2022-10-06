package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Services.MonitorService;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;

public class MonitorImpl implements MonitorService {

    ObservableList<Monitor> observableListMonitor=new ObservableList<Monitor>() {
        @Override
        public void addListener(ListChangeListener<? super Monitor> listChangeListener) {

        }

        @Override
        public void removeListener(ListChangeListener<? super Monitor> listChangeListener) {

        }

        @Override
        public boolean addAll(Monitor... monitors) {
            return false;
        }

        @Override
        public boolean setAll(Monitor... monitors) {
            return false;
        }

        @Override
        public boolean setAll(Collection<? extends Monitor> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Monitor... monitors) {
            return false;
        }

        @Override
        public boolean retainAll(Monitor... monitors) {
            return false;
        }

        @Override
        public void remove(int i, int i1) {

        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Monitor> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Monitor monitor) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Monitor> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Monitor> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Monitor get(int index) {
            return null;
        }

        @Override
        public Monitor set(int index, Monitor element) {
            return null;
        }

        @Override
        public void add(int index, Monitor element) {

        }

        @Override
        public Monitor remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Monitor> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Monitor> listIterator(int index) {
            return null;
        }

        @Override
        public List<Monitor> subList(int fromIndex, int toIndex) {
            return null;
        }

        @Override
        public void addListener(InvalidationListener invalidationListener) {

        }

        @Override
        public void removeListener(InvalidationListener invalidationListener) {

        }
    };
    @Override
    public void createMonitor(String name, String email, String cellphoneNumber, String id) {
        observableListMonitor.add(new Monitor(name,email,cellphoneNumber,id));
        System.out.println("Works");
    }

    public ObservableList<Monitor> getObservableListMonitor() {
        return observableListMonitor;
    }
}
